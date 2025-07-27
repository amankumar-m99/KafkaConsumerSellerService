package indeedcoder.kafkaconsumersellerservice.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellerOrder implements Serializable {

	private static final long serialVersionUID = -1102602105271471281L;

	private String id;
	private String customerName;
	private String itemId;
	private Date dateOfOrder;

}
