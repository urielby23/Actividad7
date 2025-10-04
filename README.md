## ❓ Preguntas y Respuestas

### 🔗 Pregunta 1: Aprovechamiento de funcionalidades

**¿Cómo se pueden aprovechar las funcionalidades de otras aplicaciones para mejorar la experiencia del usuario en una aplicación propia?**

**Respuesta:**  
Se pueden usar las funciones de otras apps mediante Intents explícitos e implícitos para delegar tareas específicas (por ejemplo, abrir la cámara, escoger contactos, reproducir sonidos). Esto ayuda a no duplicar funciones, mejora la experiencia (el usuario ya conoce qué app se abrirá) y hace que el proyecto sea más simple y pequeño. También es importante manejar errores cuando la app que se necesita no está disponible y ofrecer opciones o mensajes claros al usuario.

### 🚀 Pregunta 2: Intents para abrir aplicaciones

**¿Cómo se pueden utilizar Intents para abrir otras aplicaciones de forma segura y eficiente?**

**Respuesta:**  
Usamos Intents implícitos para acciones comunes como ACTION_VIEW, ACTION_SEND y ACTION_DIAL, y primero verificamos con `resolveActivity()` si hay alguna actividad que pueda manejar el Intent. Para mayor seguridad y mejor experiencia de usuario, limitamos los datos sensibles en los Intents, utilizamos `Uri` apropiadas (como content:// para archivos) y manejamos errores con try/catch. Para abrir aplicaciones específicas, usamos Intents explícitos con packageName o `setComponent`, pero solo cuando sea necesario y esté bien documentado.

### 🔄 Pregunta 3: Compartir datos entre aplicaciones

**¿Cómo se pueden utilizar Intents para compartir datos y acciones entre diferentes aplicaciones?**

**Respuesta:**  
Usando `Intent.ACTION_SEND` o `ACTION_SEND_MULTIPLE` para compartir texto y fotos; configurando el tipo MIME (`setType("image/*")`, `setType("text/plain")`) y añadiendo `putExtra(Intent.EXTRA_STREAM, uri)` para archivos. También se pueden usar Content Providers para compartir datos más ordenados y seguros, con permisos temporales (`FLAG_GRANT_READ_URI_PERMISSION`). Siempre revisa y limita el acceso si los datos son importantes.

### 💭 Reflexión Personal

**Reflexión del tema (mínimo 50 palabras):**

La comunicación entre aplicaciones usando Intents es una herramienta útil que permite crear experiencias integradas en el ecosistema Android. Al delegar tareas (por ejemplo, usar la cámara, compartir contenido o navegar), la aplicación se mantiene ligera y aprovecha funciones ya existentes en otras apps. Sin embargo, es importante verificar si las funciones están disponibles y manejar los permisos y URIs con cuidado para proteger la información del usuario y ofrecer una experiencia consistente.

## 📸 Capturas de Pantalla
![Pantalla ](screenshots/pantalla.png)

