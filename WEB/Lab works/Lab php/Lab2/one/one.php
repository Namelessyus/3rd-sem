<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Submission</title>
</head>
<body>
    <form action="" method="POST" enctype="multipart/form-data">
        Name:
        <br>
        <input type="text" name="Name" required>
        <br>
        Email:
        <br>
        <input type="email" name="Email" required>
        <br>
        Phone Number:
        <br>
        <input type="number" name="Phone" required>

        <br>
        Gender:
        <input type="radio" name="Gender" value="Male" required> Male
        <input type="radio" name="Gender" value="Female" required> Female
        <br>
        <input type="submit" value="Submit" name="Submit">

            <button>
        <a href="view.php">View records</a>
    </button>
    
    </form>
<!DOCTYPE html>
<html>
<head><title>Form Submission</title></head>
<body>
    <form method="POST">
    </form>

    <?php
    include 'connect.php';

    if (isset($_POST['Submit'])) {
        $name =  $_POST['Name'];
        $Email = $_POST['Email'];
        $Phone = $_POST['Phone'];
        $Gender = $_POST['Gender'];

        $sql = "INSERT INTO user_info (Name, Email, Phone, Gender) 
                VALUES ('$name', '$Email', '$Phone', '$Gender')";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo "<br>Records were inserted successfully.";
        } else {
            echo "<br>Records were not inserted. Error: " . mysqli_error($conn);
        }
    }
    ?>
</body>
</html>

</body>
</html>