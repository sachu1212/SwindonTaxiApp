// This constant would receive data from the database, not be hardcoded.
const creds =   [ {"user":"Jbloggs","password":"pass"},{"user":"Jsmith","password":"otherpass"} ]; 

function login(formData) {
    console.log(formData[0].value);
    console.log(formData[1].value);

    for (cred in creds) {
        console.log(creds[cred]);
        cred = creds[cred];
        console.log(formData[0].value + " | " + cred["user"]);
        console.log(formData[1].value + " | " + cred["password"]);
        if (formData[0].value == cred["user"] && formData[1].value == cred["password"])
        {
            console.log("Match Found");
            window.location = "index.html";
        }
    }

    return false;
}