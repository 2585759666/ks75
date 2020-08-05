package com.kgc;



import com.kgc.pojo.Enterprisetalent;
import com.kgc.service.DepartmentService;
import com.kgc.service.EnterprisetalentService;
import com.kgc.util.PageUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ks75Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Ks75Application.class, args);
        EnterprisetalentService enterprisetalent=run.getBean(EnterprisetalentService.class);
        DepartmentService department=run.getBean(DepartmentService.class);
       /* List<Department> departments=department.getAllDepartment();
        for (Department d:departments ){
            System.out.println(d.getId()+d.getDeptname());
        }*/
		
		//分页查询
      PageUtil<Enterprisetalent> page=enterprisetalent.getSalePage(-1,1,5);

		System.out.println("当前页码:"+page.getPageIndex());
		System.out.println("每页条数:"+page.getPageSize());
		System.out.println("总条数:"+page.getTotalCount());
		System.out.println("总页数:"+page.getTotalPage());

		for( Enterprisetalent p : page.getList()) {
			System.out.println(p.getId()+"\t"+p.getDepartmentId()+p.getWorkingLife()+p.getDeptname());
		}



    }

}
