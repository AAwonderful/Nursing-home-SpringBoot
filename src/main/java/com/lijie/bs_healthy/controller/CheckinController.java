package com.lijie.bs_healthy.controller;

import com.github.pagehelper.PageInfo;

import com.lijie.bs_healthy.model.BedInfo;
import com.lijie.bs_healthy.model.CheckinInfo;
import com.lijie.bs_healthy.service.BedService;
import com.lijie.bs_healthy.service.CheckinService;
import com.lijie.bs_healthy.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/checkin")
public class CheckinController {

    @Resource
    private CheckinService checkinService;

    @Resource
    private BedService bedService;

    /**
     * 分页查询
     * @param currPage
     * @return
     */
    @RequestMapping("query/{currPage}")
    public PageInfo<CheckinInfo> list(@PathVariable Integer currPage, @RequestBody CheckinInfo checkinInfo){
        System.out.println(checkinInfo.toString());
        return checkinService.queryAll(currPage,checkinInfo);
    }

    @RequestMapping("list")
    public List<CheckinInfo> list(){
        return checkinService.list();
    }

    /**
     *
     * @param checkinInfo
     * @return
     */
    @RequestMapping("add")
    public ResultVO add(@RequestBody CheckinInfo checkinInfo){
        System.out.println(checkinInfo.toString());
        if(checkinInfo.getBedId()!=null) {
            BedInfo bedInfo = bedService.getById(checkinInfo.getBedId());
            bedInfo.setCustName(checkinInfo.getCustName());
            bedInfo.setState("1");
            bedService.update(bedInfo);
        }
        checkinService.add(checkinInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id) {
        System.out.println(id);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        checkinService.del(id);
        return resultVO;
    }

    /**
     * 根据主键加载
     * @param id
     * @return
     */
    @RequestMapping("get/{id}")
    public CheckinInfo get(@PathVariable Integer id){
        return  checkinService.getById(id);
    }

    /**
     * 修改
     * @param checkinInfo
     * @return
     */
    @RequestMapping("update")
    public ResultVO update(@RequestBody CheckinInfo checkinInfo){
        System.out.println("修改"+checkinInfo.toString());
        checkinService.update(checkinInfo);
        ResultVO resultVO = new ResultVO(200,"操作成功");
        return resultVO;
    }
}
