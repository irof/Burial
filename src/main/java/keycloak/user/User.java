package keycloak.user;

import keycloak.realm.Realm;

public class User {
    Realm realm;

    UserId userId;
    UserEmail userEmail;
    UserPassword userPassword;
}
