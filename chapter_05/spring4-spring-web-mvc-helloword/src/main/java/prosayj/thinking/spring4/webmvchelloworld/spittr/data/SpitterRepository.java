package prosayj.thinking.spring4.webmvchelloworld.spittr.data;


import prosayj.thinking.spring4.webmvchelloworld.spittr.Spitter;

/**
 * SpitterRepository
 *
 * @author yangjian
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
