package com.iu.s1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.board.BoardVO;

@Controller
@RequestMapping(value = "/board/")// /board/test/boardWrite
public class BoardController {
	
	@RequestMapping(value = "boardSelect", method = RequestMethod.GET)
	public ModelAndView boardSelect(int num, ModelAndView mv) {
		//파라미터이름이 num인것을 맵핑
		System.out.println("num: "+num);
		mv.addObject("num", num);
		mv.setViewName("board/boardSelect");
		
		return mv;
	}
	
	@RequestMapping(value = "boardWrite", method = RequestMethod.POST)
	public String boardWrite2(BoardVO boardVO) {
			
		System.out.println(boardVO.getNum());
		System.out.println(boardVO.getTitle());
		System.out.println(boardVO.getWriter());
		System.out.println(boardVO.getContents());
		System.out.println(boardVO.getHit());
		
		
		
		return "redirect:../";
	}
	
	@RequestMapping(value = "boardWrite", method = RequestMethod.GET)
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	//boardList메서드명 board/boardList
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public Model boardList(Model model) {
		String result ="Change";
		String result2 ="Another Data";
		
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("title");
		
		model.addAttribute("result", result);
		model.addAttribute(boardVO);
		//model.addAttribute("result2", result2);
		return model;
	}

}
