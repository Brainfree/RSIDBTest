package com.hdhelper.itemdb;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;

import java.io.IOException;

public class JGitTest {

    public static void main(String[] args) throws IOException {

        String localPath = "/home/me/repos/mytest";
        String remotePath = "git@github.com:me/mytestrepo.git";
        Repository localRepo = new FileRepository(localPath + "/.git");
        Git git = new Git(localRepo);




    }

}
