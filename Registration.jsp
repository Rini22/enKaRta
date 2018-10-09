<%-- 
    Document   : Registration
    Created on : 9 Oct, 2016, 10:23:07 AM
    Author     : karishma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
         <style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
			
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>
    <div class="container">
        <header>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h2>Registration</h2>
    </header>
    <body>
       
        <form action= "SaveUser" method=post>
            <pre>
                Login Id <input type=text name="Id" value="" required maxlength="20"/>
                Password <input type=password name="pwd" value=""required maxlength="20" minlength="7"/>
                Name     <input type=text name="name" value=""required/>
                City     <input type=text name="city" value=""required/>
                State           <select name="state">
<option>Andaman and Nicobar Islands </option>
<option>Andhra Pradesh</option>
<option>Arunachal Pradesh</option>
<option>Assam</option>
<option>Bihar</option>
<option>Chhattisgarh</option>
<option>Goa</option>
<option>Gujarat</option>
<option>Haryana</option>
<option>Himachal Pradesh</option>
<option>Jammu & Kashmir</option>
<option>Jharkhand</option>
<option>Karnataka</option>
<option>Kerala</option>
<option>Madhya Pradesh</option>
<option>Maharashtra</option>
<option>Manipur</option>
<option>Meghalaya</option>
<option>Mizoram</option>
<option>Nagaland</option>
<option>Odisha (Orissa)</option>
<option>Punjab</option>
<option>Rajasthan</option>
<option>Sikkim</option>
<option>Tamil Nadu</option>
<option>Telangana </option>
<option>Tripura</option>
<option>Uttar Pradesh</option>
<option>Uttarakhand</option>
<option>West Bengal</option>
<option>Dadra and Nagar Haveli</option>
<option>Daman and Diu</option>
<option>Lakshadweep</option>
<option>Delhi – National Capital Territory</option>
<option>Puducherry (Pondicherry)</option>
</select>
                    

                    <input type=submit value="submit"/>
            </pre>
                
        </form>
        <footer>Copyright Â© enKaRta.com</footer>
    </body>
</html>
