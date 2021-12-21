package ru.job4j.forum.model;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User {

    private int id;

    private String password;

    private String username;

    private boolean enabled;

    private Authority authority;

    private Set<Post> postSet = new HashSet<>();

    public static User of(int id, String password, String username, boolean enabled) {
        User user = new User();
        user.id = id;
        user.password = password;
        user.username = username;
        user.enabled = enabled;
        return user;
    }

    public void addAuthorityToUser(Authority authority) {
        this.authority = authority;
    }

    public void addPostToUser(Post post) {
        this.postSet.add(post);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Post> getPostSet() {
        return postSet;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", password='" + password + '\''
                + ", username='" + username + '\''
                + ", enabled=" + enabled
                + '}';
    }
}
