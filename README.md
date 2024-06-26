# Login and Registration Form using Java and MySQL
This project uses the Java Database Connectivity (JDBC) API to register new user accounts and facilitate logins. User-provided usernames and passwords are inserted into a MySQL database table via a GUI interface. Users can then log in by comparing their input on the login page to the information stored in the database. If successful, they are granted access to the welcome page.

## Tools & Requirements
- MySQL
- JDBC Driver for MySQL (Connector/J)
- For this project, a database called "users" was created containing a table called "info" formatted as follows:
<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/4025f646-8507-4490-b56a-f5afa4c44d5d">
</p>

- It is also essential for the MySQL Service to be running at all times for this project to function correctly.


## Project Screenshots
- This is the first screen you see upon running the application. There are text fields for a username and password, a login button and a register button.

<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/8685e1ee-9d62-4100-af93-89c7430d8a3e">
</p>

- Attempting to login with incorrect credentials shows the following error message:
<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/8bc2b5b0-f145-4778-ac55-c7e0fec36638">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/c5d54a5d-fe1c-4385-9a1c-e775cac10623">
</p>

- Clicking the Register button takes you to the following screen, where you are able to create a new username and password:
<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/af7d8cb6-ce31-4aa9-b2ed-7776f23d126e">
</p>

- For this example we are registering with the following credentials:
- Username: admin
- Password: admin
<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/a04efd2d-d90b-46c6-9152-cb4705cc3622">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/d80b9660-fbab-44c4-be2f-91d2c288348f">
</p>

- Logging in with the newly registered credentials now takes you to a welcome page which displays a link to [my portfolio](https://mjhendricks.github.io/).
<p align="center">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/8bc2b5b0-f145-4778-ac55-c7e0fec36638">
<img src="https://github.com/MJHendricks/LoginForm/assets/65013192/0f1ea6a5-e523-452b-be47-80b38aec8699">
</p>
