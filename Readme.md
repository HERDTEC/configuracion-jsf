# JSF

## Crear un proyecto en eclipse
1. Crear un proyecto web dinamico
2. Click derecho en el proyecto > Configure > Add Jsf Capabilities
3. Click derecho en el proyecto > Configure > Convert to Maven Project
4. Anadir en el archivo web.xml ek archivo index.xhtml
```xml
<welcome-file-list>
    <welcome-file>faces/index.xhtml</welcome-file>
</welcome-file-list>
```
> Si el welcome files no tiene el path `faces/` especificado en el servelet jsf, no se mostraran los componentes jsf
5. Click derecho en la carpeta WebContent> New > Xhtml Page

> Si el archivo esta en blanco crear un snippet. window > show Views snipets, posteriormente click derecho en la ventana de snippets > Customize y anadir las categoria e item necesario, adicionalmente agregar el codigo.
```
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
```
6. Agregar el snippet al archivo index.xhtml
> Como otra opcion entrar al archivo en blanco index.xhtml, precionar las teclas Ctrl+Barra Espaciadora, y seleccionar Blank Facelets Page, y hacer los cambios necesarios para obtener el codigo almacenado en el snnipet.

## ManagedBeans
Controladores en jsf

### Crear un manage bean en eclipse

1. Crear un paquete para agrupar los controladores
2. Click Derecho en el paquete  > New > Class
3. Colocar antes de la declaracion de la clase las anotaciones `@ManagedBean` y `@RequestScoped`

