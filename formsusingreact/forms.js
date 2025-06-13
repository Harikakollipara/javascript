function Forms()
{
    return(
        <div>
            <table border={4} width={600}>
            <h1> Registeration form </h1>
            <label>First Name:</label>
            <input layer="text" required></input>
            <br></br><br></br>
            <label>Email:</label>
            <input type="email" required></input>
            <br></br>
            <br></br>
            <label>Password:</label>
            <input type="password"></input><br></br><br></br>
             <label>Conform Password:</label>
            <input type="password"></input><br></br><br></br>
            <label>Date of Birth</label>
            <input type="datetime-local"></input>
            <br></br><br></br>
            <label>Gender</label><br></br>
            <input type="radio"></input>
             <label>Female</label>
            <input type="radio"></input>
             <label>Male</label>
            <input type="radio"></input>
             <label>others</label><br></br><br></br>
             <label>City</label>
             <input type="text"></input><br></br><br/>
             <label>Mobile number:</label>
             <input type="tel"></input><br></br>
            <br></br>
            <button>SUBMIT</button><br></br>
            </table>
        </div>
    );
}
export default Forms;