README - Conversion Application
Overview
This application allows users to convert between different units of mass and length. It is a Java-based web application that utilizes servlets and JSP pages to interact with the user and provide conversion results.

Features
Mass Conversion: Convert between grams (g), kilograms (kg), milligrams (mg), and more.
Length Conversion: Convert between millimeters (mm), centimeters (cm), and meters (m).
Project Structure
Packages
za.ac.java

Convert.java: Contains the core logic for mass and length conversions. Two methods are provided:
convertMass(String opt, double num1): Converts mass based on the option provided (opt), such as "G-Kg", "mg-g", "g-mg", etc.
convertLength(String opt, double num1): Converts length based on the option provided (opt), such as "mm-cm", "cm-m", "m-mm", etc.
za.ac.serverlet

conversionServerlet.java: Handles mass conversion requests submitted via the form. It retrieves the user input, performs the conversion, and forwards the result to the display page (disp.jsp).
LengthConversion.java: Handles length conversion requests. It processes user input, performs the conversion, and forwards the result to the Length.jsp page.
JSP Pages
disp.jsp: Displays the result of the mass conversion.
Length.jsp: Displays the result of the length conversion.
Dependencies
Java Servlets API: Required for the servlet to process HTTP requests.
JSP (JavaServer Pages): Used to dynamically display the results to the user.
How It Works
Mass Conversion
The user submits a form with the mass value and the conversion option (e.g., grams to kilograms).
The conversionServerlet retrieves these values and calls the convertMass() method from the Convert class.
The result is forwarded to disp.jsp and displayed to the user.
Length Conversion
The user submits a form with the length value and the conversion option (e.g., millimeters to centimeters).
The LengthConversion servlet retrieves these values and calls the convertLength() method from the Convert class.
The result is forwarded to Length.jsp and displayed to the user.
Usage
Ensure that you have a web server (e.g., Apache Tomcat) installed and configured.
Deploy the application on the server.
Access the conversion forms via your web browser, fill out the required fields, and submit to see the converted result.
Sample Code
Mass Conversion Example (Servlet)

String opt = request.getParameter("opt");
double num = Double.parseDouble(request.getParameter("num"));
Convert con = new Convert();
String answer = con.convertMass(opt, num);
request.setAttribute("answer", answer);
RequestDispatcher disp = request.getRequestDispatcher("disp.jsp");
disp.forward(request, response);
Length Conversion Example (Servlet)


String opt = request.getParameter("opt");
double num1 = Double.parseDouble(request.getParameter("num1"));
Convert ln = new Convert();
String answer = ln.convertLength(opt, num1);
request.setAttribute("answer", answer);
RequestDispatcher rd = request.getRequestDispatcher("Length.jsp");
rd.forward(request, response);
JSP Example (Display Result)
jsp

<%
  String answer = (String) request.getAttribute("answer");
%>
<p><%= answer %></p>
Future Improvements
Add more unit conversions for both mass and length.
Implement error handling for invalid input (e.g., non-numeric values).
Provide a better UI for the user, with clear labels and instructions.
Expand functionality to include other types of conversions (e.g., volume, temperature).
License
This project is open-source and can be used, modified, and distributed freely.
