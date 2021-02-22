package prosayj.thinking.spring4.webviewthymeleaf.spittr.data;


import prosayj.thinking.spring4.webviewthymeleaf.spittr.Spitter;

/**
 * SpitterRepository
 *
 * @author yangjian
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
