
#!/bin/bash



#####################################################################################
################ must use root ######################################################
#####################################################################################

# if fail do not continue
set -e



#install something
sudo apt-get update
updatedb
sudo apt-get install curl -y

# install tree to view floder
sudo apt-get install tree -y

# To install oh-my-zsh first should install zsh
# auto use zsh
sudo apt-get install git -y

# set nonu to cancle line-number
sudo apt-get install zsh -y

# install oh-my-zsh
sh -c "$(wget https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh -O -)"
sudo apt-get install autojump -y

echo "
##################alias######################
alias cp="cp -i"
alias mv="mv -i"
alias github="git-open"
##################alias######################
" >> ~/.zshrc

# see shells, change each user shell
# cat /etc/shells
# vi /etc/passwd
##########################
# or use `chsh` and enter /bin/bash


# install docker
curl -fsSL https://get.docker.com/ | sh

# install docker-compose
curl -L https://github.com/docker/compose/releases/download/1.23.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose

# install kubectl
https://kubernetes.io/docs/tasks/tools/install-kubectl/

# install minikube
# https://kubernetes.io/docs/tasks/tools/install-minikube/
curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 \ && chmod +x minikube
sudo cp minikube /usr/local/bin && rm minikube

# clean up enviroment
sudo rm -rf /var/lib/minikube/certs/
sudo rm -rf /etc/kubernetes
sudo rm -rf /data/minikube
sudo rm -rf ~/.minikube

# Setup configs
sudo minikube config set kubernetes-version v1.12.7

# Launch Minikube
CHANGE_MINIKUBE_NONE_USER=true sudo -E minikube start --vm-driver=none

# Enable Ingress
sudo minikube addons enable ingress
sudo kubectl get pods -n kube-system

# know issue
OPEN storage-provisioner crashing looping (Error getting server version: Get https://10.96.0.1:443/version: dial tcp 10.96.0.1:443: i/o timeout): https://github.com/kubernetes/minikube/issues/3129  
CLOSE crictl not found in system path (not a error, can be ignored): https://github.com/kubernetes/kubeadm/issues/613
CLOSE minikube needs to downgrade docker to 18.06: https://github.com/kubernetes/minikube/issues/3323


###############################################################################


# install golang
sudo add-apt-repository ppa:longsleep/golang-backports
sudo apt-get update
sudo apt-get install golang-go

# install glide before it should set go-path and go env
curl https://glide.sh/get | sh

# install goimports, maybe should export http_proxy, https_proxy
go get golang.org/x/tools/cmd/goimports

# k8s issue for build up minikub


################################################################################################################################################################
#     TODO: go-path setting
#     first: go env | grep GOPATH
#     Add it to ~/.profile
#     like this:
#     export GOPATH="/home/vimi/go"
#     export GOBIN="$GOPATH/bin"
#     PATH="$GOPATH/bin:$HOME/bin:$HOME/.local/bin:$PATH"
#
#     WARNING: need to reboot
#################################################################################################################################################################

# install ctags
sudo apt-get install ctags
sudo apt-get upgrade ctags
# https://www.jianshu.com/p/ad907d987d48


#install shutter and prease enter
sudo add-apt-repository ppa:shutter/ppa
sudo apt-get update
sudo apt-get install shutter -y

################################################################################################
#     install svn
#     svn log
#     alias svn_log="svn log | head -20"
#     alias svn_update="svn update"
#     alias svn_delworkspace="svn revert -R *"
#     svn cl vimi-fix test.php
#     svn ci -m 'commit' --cl vimi-fix
#
#################################################################################################

# install git-fls
# git lfs track xxx
curl -s https://packagecloud.io/install/repositories/github/git-lfs/script.deb.sh | sudo bash
sudo apt-get install git-lfs

# install dos2unix
# refer http://kuanghy.github.io/2017/03/19/git-lf-or-crlf
sudo apt-get install dos2unix
cat "alias gitclear=find . -type f -exec dos2unix {} +" >> ~/.zshrc

# install xclip
sudo apt-get install xclip
# how to use: cat file | xclip -selection clipboard
#

######################################
# 查看git的配置
# git config --global http.proxy sock5://127.0.0.1:1080
# git config --global https.proxy sock5://127.0.0.1:1080
# git config --list
#######################################

# 注意!!!!! 能否使用
# sudo apt-get autoremove
# sudo apt-get autoclean

# cheat
pip install cheat

# git icdiff
# https://github.com/jeffkaufman/icdiff

# install tmux
# tmux -V
# tmux next-2.9
