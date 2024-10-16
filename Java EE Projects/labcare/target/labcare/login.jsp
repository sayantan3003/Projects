<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LabCare</title>
    <link rel="stylesheet" href="./stylesheet/login.css">
</head>
<body>
    <div class="container">
        <div class="card-container">
            <h1 class="header">LabCare</h1>
            <div class="form-container">
                <form action="/labcare/servletlogin">
                    <div class="input-container">
                        <input type="text" placeholder="username" name="username" class="input-element">
                        <input type="password" placeholder="password" name="password" class="input-element">
                    </div>
                    <div class="button-element">
                        <button class="submit-button" type="submit">Log In</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>