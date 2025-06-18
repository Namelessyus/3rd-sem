<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
</head>

    <style>
    span{
        color:red;
    }
    </style>

<body>
    <form action="" method="POST">
        <span class="error">*required</span>
        <br>

        Name:
        <input type="text" name="Name" required>
        <span class="error">*</span>
        <br>

        Email:
        <input type="email" name="Email" required>
        <span class="error">*</span>
        <br>

        Website
        <input type="url" name="website" id=""><br><br>
        <textarea name="Comment" id="" cols="20" rows="5" placeholder="Comment">
        </textarea>
        <br>

        Gender:
        <span class="error">*</span>
        <input type="radio" name="Gender" value="Male" required> Male
        <input type="radio" name="Gender" value="Female" required> Female
        <br>

        <input type="submit" value="Submit" name="Submit">
    </form>

        <?php
            $Nameerr=$Emailerr=$Websiteerr=$Gendererr="";
                if($_SERVER['REQUEST_METHOD']=='POST')
        {
            //Name
            $Name = $_POST['Name'];
            if(empty($Name))
                {
                    $Nameerr="Name cant be empty";
                }
            else{
                    $Name=test_input($_POST['Name']);
                    if(!preg_match('^[A-Za-z]+$',$Name))
                    {
                        $Nameerr="Name should only contain letters";

                    }
                    else{
                            $Nameerr="Name is valid";
                        }
                }


            //Email
            $Email = $_POST['Email'];
            if(empty($Email))
                {
                    $Emailerr="Name cant be empty";
                }
            else{
                    $Email=test_input($_POST['Email']);
                    if(!preg_match('^[\w.-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$',$Email))
                    {
                        $Emailerr="Invalid email";

                    }
                    else{
                        $Emailerr="Email is valid";
                    }
                }


            //Website
            $Website = $_POST['Website'];
            if(empty($Website))
            {
                $Websiteerr="Website cant be empty";
            }
            else{
                $Website=test_input($_POST['Website']);
                if(!preg_match('^(https?:\/\/)?([a-zA-Z0-9-]+\.)+[a-zA-Z]{2,}(:\d{1,5})?(\/[^\s]*)?$/',$Website))
                {
                    $Websiteerr="Invalid Website";

                }
                else{
                    $Websiteerr="Website is valid";
                }
            }

            //Gender
            $Gender = $_POST['Gender'];
            if(empty($Gender))
                {
                    $Genderer="Gender cant be empty";
                }
            else{
                    $Gender=test_input($_POST['Gender']);
                }
        
        }

        function test_input($data) {
            $data = trim($data);               
            $data = stripslashes($data);       
            $data = htmlspecialchars($data);   
            return $data;
        }

        ?>
</body>
</html>
