<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 5/15/2023
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Student</title>
    <style>
        body {
            margin: 100px 0 0 230px;
            font-family: sans-serif;
            /* background-color: #4070f4; */
        }

        #container {
            width: 900px;
            height: 500px;
            border-radius: 6px;
            box-shadow: 18px 22px 15px rgb(0 0 0 );
            background-color: whitesmoke;
            margin-left: 330px;
            margin-top: 200px;
        }

        h2 {
            position: relative;
            left: 30px;
            top: 10px;
        }

        #parent {
            width: 900px;
            height: 217px;
            display: flex;
        }

        div {
            width: 450px;
            height: 217px;
        }

        table {
            position: relative;
            left: 30px;
        }

        input {
            padding: 8px;
            width: 360px;
            border-radius: 8px;
            cursor: pointer;
            margin-bottom: 18px;
        }

        textarea {
            max-width: 824px;
            max-height: 92px;
            border-radius: 8px;
            border: 2px solid black;
            cursor: pointer;
        }

        .submit {
            position: relative;
            top: 10px;
            left: 805px;
            padding: 5px;
            font-weight: bolder;
            border-radius: 5px;
            cursor: pointer;
            background-color: rgba(0, 0, 255, 0.8);
            color: white;
            margin-bottom: 8px
        }

        .back {
            position: relative;
            top: -26px;
            left: 753px;
            padding: 5px;
            font-weight: bolder;
            border-radius: 5px;
            cursor: pointer;
            background-color: rgba(0, 0, 255, 0.8);
            color: white;
            margin-bottom: 8px
        }

        .submit:hover {


        } .back:hover {
              background-color: black;
              color: white;
          }

        label {
            font-weight: bolder;
            position: relative;
            top: -2px;
        }

        #id {
            width: 60px;
            margin: 5px 0 0 5px;
        }


        .id {
            margin-left: 446px;
            font-weight: bolder;
        }

        strong {
            font-size: 25px;
        }
        .error {
            color:red;
            font-size: smaller;

        }
        p{
            display: inline;
        }
    </style>

    <script>


    </script>
</head>

<body>
<div id="container">



    <%--@elvariable id="student" type="Skytech.student"--%>
    <form:form modelAttribute="student"  action="updateDetails" method="post" >

        <table>
            <tr>
                <td>
                    <strong> Update Student Details</strong>
                    <span class="id">ID</span> <input type="text" id="id" value="${student.id}" readonly name="id">

                </td>
            </tr>
        </table>
        <div id="parent">
            <div>
                <table>
                    <tr>
                        <td>
                           <form:errors path="name" cssClass="error"/><br>
                            <label for="name">Name</label><br>
                            <input type="text" placeholder="Enter Name" id="name" value="${student.name}" name="name"><br>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:errors path="email" cssClass="error"/><br>
                            <label for="email">Email</label><br>
                            <input type="text" placeholder="Enter Email" id="email" value="${student.email}" name="email"><br>

                        </td>
                    </tr>
                </table>

            </div>
            <div>
                <table>
                    <tr>
                        <td>
                            <form:errors path="phoneNo" cssClass="error"/><br>
                            <label for="phone">Phone</label><br>
                            <input type="text" placeholder="Enter Phone" id="phone" value="${student.phoneNo}" name="phoneNo"><br>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:errors path="age" cssClass="error"/><br>
                            <label for="age">Age</label><br>
                            <input type="number" placeholder="Enter Age" id="age"  value="${student.age}" name="age" ><br>

                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <table>
            <tr>
                <td>
                    <form:errors path="address" cssClass="error"/><br>
                    <label for="address">Permanent Address </label><br>
                    <input type="text" name="address" id="Address"  placeholder="Enter Address as per Aadhar Card "  value="${student.address}" ><br>
                </td>
            </tr>
        </table>

        <a href=""><button class="submit">Submit</button></a>
    </form:form>
    <a href="getback/${student.id}">   <button class="back"> Back </button> </a>



</div>


</body>

</html>
