#ABM Simple

##Objetivo
Desarrollar un abm de personas simple con capas:

- UI 
- Controlador
- Entidades
- Datos

##Características
Los datos a registrar de las personas son: DNI, nombre, apellido y email.
Las acciones que permitirá el abm serán:

- Alta y Modificación. Se deberán ingresar los datos de la persona y presionar el botón Guardar. Si el DNI ingresado ya existe en la lista de personas deberán actualizarse los demás datos, si no existe deberá agregarse la nueva persona al listado.
- Baja. Se deberá ingresar el DNI y presionar el botón Borrar. Si el DNI existe será eliminado de la lista
- Buscar. Se ingresará un DNI al presionar el botón Buscar se deberán cargar los demas datos de la persona si la misma existe
- Listar. Se contará con un listado de personas el cual deberá ser actualizado mediante un botón de actualizar.

##Etapas

**Etapa 1**
Se implementará una UI de escritorio usando Swing y WindowBuilder, la capa de Datos funcionará en memoria.

**Etapa 2**
Se implementará una capa de datos en base de datos que reemplace la de la Etapa 1. Las demás capas serán las mismas. Se agregará el atributo id a los datos que debe obtenerse de la base de datos por un campo autoincremental.

**Etapa 3**
Se reemplazará la capa de UI de escritorio por una capa Web que deberá interactuar con las demás capas de la Etapa 2. La capa Web será hecha con HTML, CSS, JavaScript, JSP y Servlets.