package com.ciscospark;

public class Person {
    private String displayName;
    private String[] emails;
    private String[] entitlements;
    private String id;
    private String[] roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String[] getEntitlements() {
        return entitlements;
    }

    public void setEntitlements(String[] entitlements) {
        this.entitlements = entitlements;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
