package run.halo.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.web.PageableDefault;
import org.springframework.lang.NonNull;
import run.halo.app.model.entity.ZhiHu;
import run.halo.app.repository.base.BaseRepository;

/**
 * User repository.
 *
 * @author johnniang
 */
public interface ZhihuRepository
    extends BaseRepository<ZhiHu, Integer>, JpaSpecificationExecutor<ZhiHu> {

    /**
     * Finds all WechatAcc by rank.
     *
     * @param pageable page info must not be null
     * @return a page of WechatAcc
     */
    @NonNull
    Page<ZhiHu> findAll(
        @PageableDefault(page = 0, size = 18, sort = "like_zan,desc") Pageable pageable);
}
