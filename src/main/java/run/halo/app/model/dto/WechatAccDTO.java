package run.halo.app.model.dto;

import javax.persistence.Column;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import run.halo.app.model.dto.base.OutputConverter;
import run.halo.app.model.entity.User;
import run.halo.app.model.entity.WechatAcc;

@Data
@ToString
@EqualsAndHashCode
public class WechatAccDTO implements OutputConverter<WechatAccDTO, WechatAcc> {
    private String dataId;
    private String name;
    private String image;
    private String appID;
    private String code;
    private String barcode;
    private int ranking;

}
