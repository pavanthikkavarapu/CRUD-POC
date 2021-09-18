package com.practice.customerapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.customerapp.entities.CustomerEntity;

public interface CustomerAppRepo extends JpaRepository<CustomerEntity, Long>{

//	List<CustomerEntity> findByEmail(String email);
	
//	@Query(value = "Select * from customer_details where FirstName=?1", nativeQuery=true)
	
	CustomerEntity findByFirstName(String firstName);
	
//	@Transactional
//	@Modifying
//	@Query(value = "update customer_details set FirstName=?2, LastName=?3, Address=?4, CompanyAddress=?5, Age=?6 where Id=?1", nativeQuery=true)
//	public void updateCustomerDetails(long id, String firstName, String lastName, String address, String companyAddress, String age);
	
//	@Transactional
//	@Modifying
//	@Query(value = "INSERT into customer_details(Id, FirstName, LastName, Address, CompanyAddress, Age) VALUES (:id, :firstName, :lastName, :address, :companyAddress, :age)")
//	public void updateCustomerDetails(@Param("id") long id,@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("address") String address, @Param("companyAddress") String companyAddress, @Param("age") String age);
}
