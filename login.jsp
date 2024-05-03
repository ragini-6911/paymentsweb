<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
 body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 50px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;

}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 50px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
  }
  
  img.icon {
    width: 50%;
    border-radius: 2%;
    align-items: center;
    padding: 30px;display: block;
    margin-left: auto;
    margin-right: auto;

  }
  
  .container {
    padding: 10px;
    align-items: center;
    background-origin: padding-box;
    border: 5px;
    width: 400px;
    height: 500px;
    text-align: center;
    border: 2px solid black;
    margin: auto;
    translate: matrix(500px,500px);
  }
  .container{
    align-self: center;
  }
  table{
    width: 100;
    border: 3px;
    margin: 30%;
  }
  h1{
    align-content: center;
    text-align: center;
    align-items: center;
    margin: 0px;
    padding: 0px;
  }
  .container{
    align-items: center;
    align-content: center;
    align-self: center;
    flex-direction: column;
    float: var(container);
    

  }
  span.psw {
    float: right;
    padding-top: 16px;
  }
  


</style>

        
        <h1> Login to your Account </h1><br><br>
        
            <form action="http://localhost:8080/WebApplication/loginservlet" method="post">
           
                <div class="container">
                    

                  <img src="C:\Users\nshiv\OneDrive\Desktop\htmlproject\images\profile icon.webp" alt="icon" class="icon">
            
                  <label for="uname"><b>Enter Phonenumber</b></label>
                  <input type="text" placeholder="Enter Username" name=phnno required>
              
                  <label for="psw"><b>Enter Password</b></label>
                  <input type="password" placeholder="Enter Password" name=password required>
                      
                  <button type="submit">Login</button>
                  <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                  </label><br><br><br>
                
              
                
                  <a href="#"> Forgot Password?</a>
                </div>
              </form>
              
       
  

</body>
</html>