package common;

/**
 * Класс, в котором хранится конфиг для проекта
 */
public class Config {
    public static final String PLATFORM_AND_BROWSER = "win_chrome"; // изменить тут, если будем использовать mac
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true; // если параметр true - куки отчищаются

    public static final Boolean HOLD_BROWSER_OPEN = true; // когда браузер открыт, если параметр true - браузер закрывается
}
