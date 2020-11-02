package ru.akaleganov.url_shortcut.service.url;

import ru.akaleganov.url_shortcut.domain.User;
import ru.akaleganov.url_shortcut.service.dto.UrlDTO;

/**
 * Class PrepareUrlService
 * интерфейс для подготовки длинного урла к сохранению 🚀🚀🚀 💥💥💥
 * @author Kaleganov Alexander
 * @since 31 окт. 20
 */
public interface PrepareUrlService {
    /**
     *
     * @param url новый урл для сохранения
     * @param userLogin {@link User#getLogin()}
     * @return {@link UrlDTO} возможно будет пустым и с заполненным еррором
     */
     UrlDTO prepareToSave(String url, String userLogin);
}
