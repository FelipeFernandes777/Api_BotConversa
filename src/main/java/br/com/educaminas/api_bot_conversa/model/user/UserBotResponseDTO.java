package br.com.educaminas.api_bot_conversa.model.user;

import br.com.educaminas.api_bot_conversa.model.bot.BotResultDTO;

public record UserBotResponseDTO(Integer id,
                                 String full_name,
                                 String first_name,
                                 String last_name,
                                 String phone,
                                 String ddd) {
    public UserBotResponseDTO(BotResultDTO data) {
        this(data.id(), data.full_name(), data.first_name(), data.last_name(), data.phone(), data.ddd());
    }
}
