<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>用户登录Utilisateur en ligne</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
            }
            h3 {
                text-align: center;
                color: #333;
            }
            form {
                width: 300px;
                margin: 0 auto;
                background-color: #fff;
                padding: 20px;
                border: 1px solid #ddd;
                border-radius: 5px;
                box-shadow: 0px 0px 5px #888;
            }
            table {
                width: 100%;
            }
            table td {
                padding: 10px;
            }
            input[type="text"],
            input[type="password"] {
                width: 100%;
                padding: 10px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }
            input[type="submit"] {
                background-color: #007BFF;
                color: #fff;
                padding: 10px 20px;
                border: none;
                border-radius: 3px;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: #0056b3;
            }
            input[type="reset"] {
                background-color: #ccc;
                color: #333;
                padding: 10px 20px;
                border: none;
                border-radius: 3px;
                cursor: pointer;
            }
            input[type="reset"]:hover {
                background-color: #999;
            }
        </style>
    </head>
    <body>
        <h3>用户登录Utilisateur en ligne</h3>
        <form action="login" method="post">
            <table>
                <tr>
                    <td>账号user</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>密码password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="登录"/>
                        <input type="reset" value="重置"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
