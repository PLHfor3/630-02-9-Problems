package main;

public class User {
    String _firstName;
    String _lastName;
    String _username;
    String _password;

    public User(String userData) {
        String stringRemaining;
        _firstName = userData.substring(0, userData.indexOf(" "));
        stringRemaining = userData.substring(userData.indexOf(" ") + 1);
        _lastName = stringRemaining.substring(0, stringRemaining.indexOf(" "));
        String stringRemaining2 = stringRemaining.substring(stringRemaining.indexOf(" ") + 1);
        _username = stringRemaining2.substring(0, stringRemaining2.indexOf(" "));
        _password = stringRemaining2.substring(stringRemaining2.indexOf(" ") + 1);

    }
    public String getName () {
        return _firstName + " " + _lastName;
    }
    private String passParse () {
        String passParsed = "";
        int hash = 0;
        while (hash < _password.length()) {
            passParsed += "*";
            hash++;
        }
        return passParsed;
    }
    public String toString() {
       String publish = "First Name: " + _firstName + "\n"
                      + "Last  name: " + _lastName + "\n"
                      + "Username: " + _username + "\n"
                      + "Password: " + passParse() + "\n";
        return publish;
    }
}
