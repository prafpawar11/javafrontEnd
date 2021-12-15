<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

table.center tr { height: 35px; }

table.center {
  margin-left: auto; 
  margin-right: auto;
}
table label {
        font-weight:bold;
    }
</style>
</head>

<body bgcolor="CadetBlue">

<div class="container">
  <form action="createAccount" method="post">
  
    <table class="center">
        <tr>
            <td><label for="fname">First Name</label></td>
            <td><input type="text" id="fname" name="fname"></td>
        </tr>
        <tr>
          <td>
            <label for="mname"> Middle Name </label>
          </td>
          <td>
            <input type="text" id="mname" name="mname">
          </td>
        </tr>

        <tr>
          <td>
            <label for="lname">Last Name</label>
          </td>
          <td>
            <input type="text" id="lname" name="lastname" >
          </td>
        </tr>
        <tr>
          <td><label for="dob">DOB</label></td>
          <td><input type="text" name="DOB" ></td>
        </tr>
        <tr>
          <td>
            <label for="email">Emaild Id</label>
          </td>
          <td>
            <input type="text" id="email" name="email">
          </td>
        </tr>
        <tr>
          <td>
            <label for="mobno">Mob No </label>
          </td>
          <td>
            <input type="text" id="mobno" name="mobno">
          </td>
        </tr>
        <tr>
          <td>
            <label for="gender">Gender:</label>
          </td>
          <td>
            <input type="radio" id="male" name="gender" value="Male">
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label>
            <input type="radio" id="custom" name="gender" value="Custom">
            <label for="custom">Custom</label>
          </td>
        </tr>
        <tr>
          <td>
               <label for="add">Address</label>
          </td>
          <td>
                 <input type="text" id="add" name="add"></input>
          </td>
        </tr>
        <tr>
          <td>
            <label for="country">Country</label>
          </td>
          <td>
            <select id="country" name="country">
              <option value="australia">Australia</option>
              <option value="canada">Canada</option>
              <option value="usa">USA</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>
            <label for="ssn">Social Security Number(SSN)</label>
          </td>
          <td>
            <input type="text" id="ssn" name="ssn"><br>
          </td>
        </tr>
        
        <tr>
          <td>
          </td>
          <td>
            <input type="submit" value="Submit">
          </td>
        </tr>
    </table>  
  </form>
</div>
</body>
</html>