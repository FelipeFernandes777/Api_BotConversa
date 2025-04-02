package br.com.educaminas.api_bot_conversa.model.bot;

public record BotResultDTO(Integer id,
                           String full_name,
                           String first_name,
                           String last_name,
                           String phone,
                           String ddd) {
}
