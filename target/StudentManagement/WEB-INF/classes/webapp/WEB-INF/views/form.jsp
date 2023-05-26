<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
         body {
             margin: 100px 0 0 230px;
             font-family: sans-serif;
             background-color: #4070f4;
        }

        #container {
            width: 900px;
            height: 380px;
            border-radius: 6px;
            box-shadow: 18px 22px 15px rgb(0 0 0 );
            background-color: whitesmoke;
            margin-left: 500px;
            margin-top: 200px;
        }


        h2 {
            position: relative;
            left: 30px;
            top: 10px;
        }

        #parent {
            width: 900px;
            height: 123px;
            display: flex;
        }

        div {
            width: 450px;
            height: 123px;
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
            margin-bottom: 8px;}

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
            background-color: black;
            color: white;
        } .back:hover {
            background-color: black;
            color: white;
        }

        label {
            font-weight: bolder;
            position: relative;
            top: -2px;
        }
    </style>
</head>

<body>
<div id="container">
    <form action="registeredSuccess" method="post">
        <h2>Student Registration</h2>
        <div id="parent">
            <div>
                <table>
                    <tr>
                        <td>
                            <label for="name">Name</label><br>
                            <input type="text" placeholder="Enter Name" id="name" name="name">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="email">Email</label><br>
                            <input type="text" placeholder="Enter Email" id="email" name="email">
                        </td>
                    </tr>
                </table>
            </div>
            <div>
                <table>
                    <tr>
                        <td>
                            <label for="phone">Phone</label><br>
                            <input type="text" placeholder="Enter Phone" id="phone" name="phoneNo">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="age">Age</label><br>
                            <input type="number" placeholder="Enter Age" id="age" name="age">
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <table>
            <tr>
                <td>
                    <label for="Address">Permanent Address </label><br>
                    <textarea name="address" id="Address" cols="110" rows="6" placeholder="Enter Address as per Aadhar Card " ></textarea>
                </td>
            </tr>
        </table>

        <button class="submit">Submit</button>
    </form>

    <a href="index">   <button class="back"> Back </button> </a>
</div>

</body>

</html>