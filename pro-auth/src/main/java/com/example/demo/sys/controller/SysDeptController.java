package com.example.demo.sys.controller;


import com.dto.PageDTO;
import com.example.demo.sys.dto.DeptSaveDto;
import com.example.demo.sys.service.ISysDeptService;
import com.example.demo.sys.vo.DeptPageVo;
import com.exception.RestBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 机构管理 前端控制器
 * </p>
 *
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/api/sys/sys_dept")
@Validated
@Api(tags = "机构管理")
public class SysDeptController {
    @Resource
    private ISysDeptService sysDeptService;

    @GetMapping("get/list")
    @ApiOperation(value = "获取机构管理分页列表数据",notes = "老默",response = DeptPageVo.class)
    public RestBean getList(PageDTO dto, @ApiParam(value = "机构名称") String deptName){
        return RestBean.ok(sysDeptService.getDeptPageByDeptName(dto, deptName));
    }

    @PostMapping("save")
    @ApiOperation(value = "保存机构信息",notes = "老默",response = RestBean.class)
    public RestBean save(DeptSaveDto dto){
        return RestBean.ok(sysDeptService.saveDept(dto));
    }


    @DeleteMapping("delete")
    @ApiOperation(value = "删除机构信息",notes = "老默",response = RestBean.class)
    public RestBean delete(@ApiParam(value = "机构id")Long id){
        return RestBean.ok(sysDeptService.removeById(id));
    }

}
