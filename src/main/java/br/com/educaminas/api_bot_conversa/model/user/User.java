package br.com.educaminas.api_bot_conversa.model.user;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    private int id;
    private String first_name;
    private String last_name;
    private String full_name;
    private String phone;
    private String ddd;

    public User(UserBotResponseDTO data) {
        this.id = data.id();
        this.first_name = data.first_name();
        this.last_name = data.last_name();
        this.full_name = data.full_name();
        this.phone = data.phone();
        this.ddd = data.ddd();
    }
}
