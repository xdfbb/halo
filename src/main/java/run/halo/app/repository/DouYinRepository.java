package run.halo.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.web.PageableDefault;
import org.springframework.lang.NonNull;
import run.halo.app.model.entity.DouYin;
import run.halo.app.repository.base.BaseRepository;

/**
 * User repository.
 *
 * @author johnniang
 */
public interface DouYinRepository
    extends BaseRepository<DouYin, Integer>, JpaSpecificationExecutor<DouYin> {

    /**
     * Finds all WechatAcc by rank.
     *
     * @param pageable page info must not be null
     * @return a page of WechatAcc
     */
    @NonNull
    Page<DouYin> findAll(
        @PageableDefault(page = 0, size = 18, sort = "like_count,desc") Pageable pageable);
}
