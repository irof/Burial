package keycloak.client;

import keycloak.realm.Realm;

public class Client {
    Realm realm;

    ClientId clientId;
    ClientSecret clientSecret;
    ValidRedirectURIs validRedirectURIs;
}
