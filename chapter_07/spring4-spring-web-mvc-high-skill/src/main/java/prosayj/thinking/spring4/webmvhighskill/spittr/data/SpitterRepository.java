package prosayj.thinking.spring4.webmvhighskill.spittr.data;


import prosayj.thinking.spring4.webmvhighskill.spittr.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
