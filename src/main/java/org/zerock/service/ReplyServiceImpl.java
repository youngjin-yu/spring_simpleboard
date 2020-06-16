package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.dao.ReplyDAO;
import org.zerock.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Inject
	private ReplyDAO dao;
	
	//댓글 조회
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.readReply(bno);
	}

	//댓글 작성
	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);		
	}
	
	//댓글 수정
	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.updateReply(vo);
	}

	@Override
	public void deleteReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteReply(vo);
	}

	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectReply(rno);
	}

}
