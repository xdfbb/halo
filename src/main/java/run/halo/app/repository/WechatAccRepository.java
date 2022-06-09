package run.halo.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.web.PageableDefault;
import org.springframework.lang.NonNull;
import run.halo.app.model.entity.WechatAcc;
import run.halo.app.repository.base.BaseRepository;

/**
 * User repository.
 *
 * @author johnniang
 */
public interface WechatAccRepository
    extends BaseRepository<WechatAcc, Integer>, JpaSpecificationExecutor<WechatAcc> {

    /**
     * Finds all WechatAcc by rank.
     *
     * @param pageable page info must not be null
     * @return a page of WechatAcc
     */
    @NonNull
    Page<WechatAcc> findAll(
        @PageableDefault(page = 0, size = 18, sort = "ranking,asc") Pageable pageable);
}
