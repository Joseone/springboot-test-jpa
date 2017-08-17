# springboot-test-jpa

# exception
org.hibernate.LazyInitializationException: could not initialize proxy - no Session

# I faced the same issue in JPA/Hibernate, and there are 2 ways to solve this issue:

1/ Turn off the LAZY by default, as following:

@Entity
@Proxy(lazy = false)
public class Project {
...
}  
Of course, this way is not recommended because of the performance issue, so you can go to the second way.

2/ You can put @Transactional at the beginning of your method, it can help you to remain the session, or another understanding, it pass the duty of session to Hibernate, as following:

@Test
@Transactional
public void testSaveGroup() {
    Department g = new Department();
    g.setName("XDG");
    assertNull(g.getId());
    this.groupRepo.save(g);
    assertNotNull(g.getId());
    System.out.println(g.getId());
    Project dummyPrj = new Project(123L, "KSTA", new Date(), "NEW", "Helm AG", g);
    this.projectRepo.save(dummyPrj);
    // verify
    List<Department> lst = this.groupRepo.findAll();
    Project savedPrj = this.projectRepo.getOne(123L);
    Assert.assertEquals("XDG", savedPrj.getGroup().getName());
}
