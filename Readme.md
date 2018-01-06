# JSF

## Crear un proyecto en eclipse
1. Crear un proyecto web dinamico
2. Click derecho en el proyecto > Configure > Add Jsf Capabilities
3. Click derecho en el proyecto > Configure > Convert to Maven Project
4. Anadir en el archivo web.xml ek archivo index.xhtml
````xml
<welcome-file-list>
    <welcome-file>faces/index.xhtml</welcome-file>
</welcome-file-list>
````
> Si el welcome files no tiene el path `faces/` especificado en el servelet jsf, no se mostraran los componentes jsf
5. Click derecho en la carpeta WebContent> New > Xhtml Page

> Si el archivo esta en blanco crear un snippet. window > show Views snipets, posteriormente click derecho en la ventana de snippets > Customize y anadir las categoria e item necesario, adicionalmente agregar el codigo.
````
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <h:head>
        <title>Facelet Title</title>
    </h:head>
    <h:body>
        Index
    </h:body>
</html>
````
6. Agregar el snippet al archivo index.xhtml
> Como otra opcion entrar al archivo en blanco index.xhtml, precionar las teclas Ctrl+Barra Espaciadora, y seleccionar Blank Facelets Page, y hacer los cambios necesarios para obtener el codigo almacenado en el snnipet.

### Agregar primefaces 
1. Agregar al pom.xml 
````xml
<dependency>
	<groupId>org.primefaces</groupId>
	<artifactId>primefaces</artifactId>
	<version>6.1</version>
</dependency>
````
2. En la cabecera del documento xhtml anadir:
````
 xmlns:p="http://primefaces.org/ui"
````

#### [Definir Tema Primefaces](https://www.primefaces.org/themes.html)

1. Agregar al pom.xml
````xml
<dependency>  
    <groupId>org.primefaces.themes</groupId>  
    <artifactId>dot-luv</artifactId>  
    <version>1.0.10</version>  
</dependency>  
````
> Para bajarse todos los comunity themes 
	
````xml
	<dependency>  
	    <groupId>org.primefaces.themes</groupId>  
	    <artifactId>all-themes</artifactId>  
	    <version>1.0.10</version>  
	</dependency>  
````

2. En el archivo anadir el tema descargado
````xml
<context-param>  
    <param-name>primefaces.THEME</param-name>  
    <param-value>dot-luv</param-value>  
</context-param> 
````
> En el caso de algun error con el archivo pom.xml 

	1. Instalar WGET
	2. wget -r -np -nH --cut-dirs=3 -R index.html http://repository.primefaces.org/org/primefaces/themes/
	3. Mover los temas a la carpeta `~/.m2/repository/org/primefaces/themes`
	4. Actualizar el indice del repositorio local.


## ManagedBeans
Unidad de trabajo elemental de JSF que atiende solicitudes de los clientes y gestionada por el servidor. En el patron MVC, representa el Modelo.
Las paginas JSF, pueden acceder al ManagedBean a traves de sus etiquetas, ya sean a sus propiedades o metodos.

### Crear un manage bean en eclipse

1. Crear un paquete para agrupar los controladores
2. Click Derecho en el paquete  > New > Class
3. Colocar antes de la declaracion de la clase las anotaciones `@ManagedBean` y `@RequestScoped`
4. Implementar la interfaz serializable

### Scopes
* Request
* View
* Session
* Application
* Custom
* None

## Validator
1. Crear paquete donde se agrupen a los validadores.
2. Click derecho en el paquete > New > Class
3. Antes de la clase usar la anotacion `@FacesValidator("nvalidador")`
4. Hacer que la clase implemente la interfaz `Validator`.
6. Hacer que la clase implemente los metodos de la interfaz y programar la validacion.
```java
 @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
     
        String ncelular = o.toString().trim();
        
        if(ncelular.length() == 0){
            throw new ValidatorException( new FacesMessage("Ingrese celular") );
        }
        else {
            String erTexto = "^9\\d\\d-\\d\\d\\d-\\d\\d\\d$";
            boolean ok = Pattern.matches(erTexto, ncelular);

            if (!ok) {
                throw new ValidatorException(new FacesMessage("Formato debe ser 9##-###-###"));
            }
        }
        
    }
```




