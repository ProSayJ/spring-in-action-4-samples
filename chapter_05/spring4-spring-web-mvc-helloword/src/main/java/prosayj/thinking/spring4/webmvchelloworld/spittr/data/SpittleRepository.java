package prosayj.thinking.spring4.webmvchelloworld.spittr.data;

import prosayj.thinking.spring4.webmvchelloworld.spittr.Spittle;

import java.util.List;

/**
 * SpittleRepository
 *
 * @author yangjian
 */
public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
