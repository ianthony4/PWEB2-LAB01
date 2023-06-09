<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br/>
<span>(formato estudiante)</span>
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Programación Web 2</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Git - GitHub</td></tr>
<tr><td>ENLACE DEL REPOSITORIO:</td><td colspan="5">https://github.com/ianthony4/PWEB2-LAB01</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>01</td><td>AÑO LECTIVO:</td><td>2023 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td colspan="2">07-05-2023</td><td>HORA DE PRESENTACIÓN:</td><td colspan="2">11:45</td>
</tr>
<tr><td colspan="4">INTEGRANTE (s):
<ul>
<li>Chaisa Fernandez, Anthony Leonel</li>
<li>El segundo integrante no se presento</li>
</ul>
</td>
<td>NOTA:</td><td>Pendiente</td>
</tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Carlo Jose Luis Corrales Delgado (ccorrales@unsa.edu.pe)</li>
<li>Richart Smith Escobedo Quispe (rescobedoq@unsa.edu.pe)</li>
</ul>
</td>
</tr>
</tbody>
</table>
<table>
<theader>
<tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
</theader>
<tbody>
<tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
A. Repositorios del trabajo individual (Laboratorio 01)
<ul>
<li>https://github.com/ianthony4/23ALAB00.git</li>
</ul>
B. Solucion del Trabajo Grupal:<br>
<br>Pasos a detalle...
<br>1. Se realizo la creacion del repositorio en GITHUB, donde esta la rama "main" siguiendo los pasos de la primera practica.
<br>2. Se hace la invitación al proyecto de github mediante la invitacion por correo electronico.
<br>3. Se crea el archivo y el esqueleto del archivo <code>Calculadora.java</code>
<br><img src="LabImgs/esqueletoCalculadora.png">
<br>4. Cada integrante en un directorio limpio hace uso del comando <code>git clone https://github.com/ianthony4/23ALAB01.git</code>
<br><img src="LabImgs/gitClone.png">
<br>5. Ahora cada integrante crea su propia rama con los comandos <code>git branch 'nuevaRama'</code>
<br>6. Seguidamente cambian a su rama creada con el comando <code>git checkout 'laRamaCreada'</code>
<br><img src="LabImgs/gitBranch.png">
<br>7. Los usuarios empiezan a programar las funciones correspondientes encargadas para <code>Calculadora.java</code> siempre guardando su progreso con ayuda de los 'commits' en cada paso importante de su progreso (<code> git log</code> para ver los commit's)
<br><img src="LabImgs/commits.png">
<br>8. Una vez que todos realizen su parte la rama <code>main</code> se encarga de juntar todas las ramas y colocarlas a la rama <code>main</code>
<br>9. Para que esto suceda cada participante debe ejecutar el comando <code>git push -u origin 'laRamaDelIntegrante'</code>
<br><img src="LabImgs/pushOrigin.png">
<br>10.Despues de esto el proceso de juntar se logra con el comando <code>git merge</code> o sino directamente desde 'GitHub' ejecutando los siguientes botones
<br><img src="LabImgs/pullReq.png">
<br><img src="LabImgs/pushReq1.png">
<br><img src="LabImgs/merge.png">
<br>11. De esa forma y ejecutando a cada rama, todas las ramas se añadiran a la rama <code>main</code>
<br>12. Este <code>merge</code> se puede apreciar como un 'commit' en el historial del proyecto
<br><img src="LabImgs/merge4.png">
<br>Donde el numero <code>#4</code> representa que este es el 4to <code>Merge</code> realizado en el proyecto
<br>
</td></tr>
<tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br>
A. ¿Por qué Git y GitHub es una herramienta importante en el curso de Programación Web 2?<br><br>
No solo para Progrmacion Web 2, sino para TODOS los cursos de programacion y proyectos. <br>
A lo largo de esta practica, los integrantes hemos podido apreciar que Git y GitHub permite controlar las versiones del proyecto, la colaboracion del proyecto con otras personas, estamos seguros que esa es una forma eficiente de mantener el codigo, tambien se observo que es facil saber lo que un colaborador hace o realiza en el proyecto con la ayuda de los commit's. Todo esto mejora la calidad y eficiencia de un trabajo, proyecto y software.<br><br>
B.¿Qué conductas éticas deberían promocionarse cuando se usa un Sistema de Control de Versiones?<br><br>
Para que cualquier equipo funcione como tal, se deben cumplir ciertos valores que promueven el desarrollo de todos los integrantes, estos son algunos valores importantes que se debe cumplir en este equipo: <br><br>
<ul>
<li>Respeto</li>
<li>Responsabilidad</li>
<li>Compromiso</li>
<li>Honestidad</li>
<li>Comunicacion</li>
</ul><br>
C. ¿Qué son los entándares de codificación?<br><br>
Son aquellas reglas, practicas y directrices que se 'recomiendan' para obtener un proyecto consistente y de muy buena calidad para que este sea entendinble, mantenible y compartible.<br>
Estos son algunos de los estandares de codificacion comunes que mejoran el codigo:<br><br>
<ul>
<li>Identación</li>
<li>Uso eficiente de espacios</li>
<li>Limite de codigo en una linea</li>
<li>Commit's de buena calidad</li>
<li>Declaracion de variables y/o funciones de valor</li>
<li>Manejo adecuado de errores y excepciones</li>
<li>Seguridad del codigo</li>
</ul><br></td></tr>
<tr><td>III. CONCLUSIONES
<ul>
<li>
Git es una herramienta bastante útil para el aprendizaje, ya que permite el fácil intercambio de información entre programadores de todo el mundo.
</li>
<li>
Para lograr un trabajo eficiente como equipo debemos cumplir con ciertos valores necesarios para que el proyecto sea el optimo y deseado, por otro lado se debe seguir otros aspectos que estan vinculadas con las buenas practicas de programación pero que buscan el mismo objetivo de mantener un codigo eficiente, legible y de alta calidad.
</li>
</ul>
</td></tr>
</tbody>
</table>
<table>
<theader>
<tr><th>RETROALIMENTACIÓN GENERAL</th></tr>
</theader>
<tbody>
<tr><td>I. RETROALIMENTACIÓN:</td></tr>
<tbody>
</table>
<table>
<theader>
<tr><th>REFERENCIAS Y BIBLIOGRAFÍA</th></tr>
</theader>
<tbody>
<tr><td>I. BIBLIOGRAFÍA
<ul>
<li>https://guides.github.com/</li>
<li>https://www.w3schools.com/java/default.asp</li>
<li>https://learn.microsoft.com/es-es/connectors/custom-connectors/coding-standards</li>
</ul>
</td></tr>
</tbody>
</table>