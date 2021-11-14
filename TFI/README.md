# Spring Security: Autenticación y Autorización
## Pasos y referencias de implementación:
● Agregar dependencias en pom.xml: spring-boot-starter-security.
● Implementación de la interfaz UserDetailsService en la clase
UserServiceImp de la capa de servicios.
● Implementación de la interface UserDetails en la clase User del modelo de datos
○ El método getAuthorities(), retornar:
Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
○ Los métodos isAccountNonExpired, isAccountNonLocked,
isCredentialsNonExpired, isEnabled; dado el alcance del trabajo
práctico todos deben retornar: true.
● Crear clase SecurityConfiguration que extienda de
WebSecurityConfigurerAdapter
○ Sobrescribir los métodos
■ void configure(AuthenticationManagerBuilder auth):
auth.userDetailsService(userDetailsService);
■ void configure(HttpSecurity http):
http.authorizeRequests()
.antMatchers("/**").hasRole("USER")
.and().formLogin();
○ En la misma clase implementar el método PasswordEncoder
getPasswordEncoder() para que retorne la instancia de
BCryptPasswordEncoder.
● Modificar implementación del método create() de UserServiceImp para que
antes de guardar la instancia del usuario a crear, encriptar la clave:
user.setPassword(new
BCryptPasswordEncoder().encode(user.getPassword()));
● Finalmente para recuperar la instancia del usuario en session, en la capa de
controlador, en los métodos donde sea requerido agregar como argumento del
método Authentication authentication y luego User sessionUser =
(User)authentication.getPrincipal(); en la implementación del método
para recuperar la instancia.
