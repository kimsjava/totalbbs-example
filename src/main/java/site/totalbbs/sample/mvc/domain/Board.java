package site.totalbbs.sample.mvc.domain;

import lombok.Data;

/**
 * bbs domain
 * @author kimsjava
 *
 */
@Data
public class Board {
	
	private int boardSeq;
	private String title;
	private String contents;
	private String regDate;
	
}
