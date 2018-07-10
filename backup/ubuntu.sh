
#!/bin/bash



#####################################################################################
################ must use root ######################################################
#####################################################################################





#install something 
sudo apt-get update
updatedb
sudo apt-get install curl -y

# install tree to view floder
sudo apt-get install tree -y

# To install oh-my-zsh first should install zsh
# auto use zsh
sudo apt-get install git -y
echo "
syntax on
set autoindent
set cindent
set nu
set ts=4
set sw=4
" > ~/.vimrc
# set nonu to cancle line-number

sudo apt-get install zsh -y
echo "
     [alias]
        lg = log --graph --pretty=format:'%Cred%h%Creset -%C(bold yellow)%d%Creset %C(bold green)%s%Creset %C(white)<%an>%Creset %C(white)(%ci)%Creset' --abbrev-commit
        st = status
        deladd = reset HEAD
        delworkspace = checkout --
        modified = rebase -i
        newbranch = checkout -b
        delbranch = branch -D
        delcommit = reset HEAD^
        goto      = reset --hard
        amend = commit --amend    
    	remoteadd = remote add origin    
		remoteset = remote set-url origin
    	co = checkout
    	reflog = reflog
	 [user]
    	email = vimiming@gmail.com
    	name = vimi
	 [color]
    	status = auto
    	diff = auto
    	branch = auto
    	interactive = auto" > ~/.gitconfig

sh -c "$(wget https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh -O -)"
sudo apt-get install autojump -y

echo "
 plugins=(
  autojump
  extract
  catimg
  ruby
  textmate
  osx
  mvn
  gradle
  )
" >> ~/.zshrc

# see shells, change each user shell
# cat /etc/shells
# vi /etc/passwd
##########################
# or use `chsh` and enter /bin/bash


# install docker
curl -fsSL https://get.docker.com/ | sh 

# install docker-compose
curl -L https://github.com/docker/compose/releases/download/1.14.0/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose

# install golang
sudo add-apt-repository ppa:longsleep/golang-backports
sudo apt-get update
sudo apt-get install golang-go
