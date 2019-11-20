package com.codeclan.example.userfilesmanagement;

import com.codeclan.example.userfilesmanagement.Repositories.FileRepository;
import com.codeclan.example.userfilesmanagement.Repositories.FolderRepository;
import com.codeclan.example.userfilesmanagement.Repositories.UserRepository;
import com.codeclan.example.userfilesmanagement.models.File;
import com.codeclan.example.userfilesmanagement.models.Folder;
import com.codeclan.example.userfilesmanagement.models.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@SpringBootTest
class UserfilesmanagementApplicationTests {
	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;
	@Autowired
	FolderRepository folderRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void createFolder() {
		User user1 = new User("Sree");
        userRepository.save(user1);

	   Folder folder1 = new Folder("Week11",user1);
	   folderRepository.save(folder1);

	   File file1 = new File("Java",10,folder1);
	   fileRepository.save(file1);

		File file2 = new File("Python",20,folder1);
		fileRepository.save(file2);

	   folder1.addFile(file1);
	   folder1.addFile(file2);
	   folderRepository.save(folder1);
	}
}
