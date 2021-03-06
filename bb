#!/bin/bash
clear && sleep 1 && echo "DICA:" ; echo ; echo "USEM OS APPS DE CONEXÃO FORÇADA" ; echo "QUE SÃO OS MELHORES" && sleep 4 && clear
Menu() {
    clear
   echo "      ================================"
    echo "            OPEN VPN DATAMI (ROOT)     "
   echo "         ================================"
    echo "                 ESCOLHA UMA OPÇÃO"
    echo 
    echo "                   APPS NORMAIS  "
   echo "         ================================"
    echo "              [ 1 ] - Escola em Casa DF"
    echo "              [ 2 ] - E-learning EC"
    echo "              [ 3 ] - Educa Olinda"
    echo "              [ 4 ] - Conecta Uneb (Off)"
    echo "              [ 5 ] - Sala Estudante SC"
    echo "              [ 6 ] - Minha Estacio"
    echo "              [ 7 ] - Conexão Escola"
    echo "              [ 8 ] - EscoLAR"
    echo "              [ 9 ] - Escola RS - Professor"
    echo "             [ 10 ] - Escola RS - Estudante"
    echo "             [ 11 ] - EDUCA SÃO LEO"
    echo "             [ 12 ] - Estude em Casa"
    echo "             [ 13 ] - Escola MSJ"
    echo "             [ 14 ] - Escola Igarassu"
    echo "             [ 15 ] - Princesa Educa+"
    echo "             [ 16 ] - ConquistApp"
   echo "         ================================"
    echo
    echo "                 CONEXÃO FORÇADA"
   echo "         ================================"
    echo "             [ 17 ] - CMSP"
    echo "             [ 18 ] - Rio Educa Em Casa"
    echo "             [ 19 ] - Aulas Parana"
    echo "             [ 20 ] - Applique-se" 
   echo "         ================================"
    echo
    echo "                     EXTRAS"
   echo "         ================================"
    echo "             [ 21 ] - App Personalizado"
    echo "             [ 22 ] - Reativar Apps"
    echo "             [ 23 ] - Change DNS"
    echo "             [ 24 ] - Atalho (Termux-Widget)"
    echo "             [ 25 ] - Baixar Apps"
    echo "              [ 0 ] - Sair do Script"
   echo "         ================================"
    echo "@luanw04"
    echo "@alpacinoo007"
    echo 
    echo "ESCOLHA UMA OPÇÃO:"
    read App
    case $App in
    1) App="org.cordova.quasar.corona.app" ; atividade=".SplashScreenActivity" ; nome="EscolaDF" ; E1="sleep 10";;
    2) App="com.portoseguru.reach4all" ; atividade="com.datami.reachall.SplashScreen" ; nome="E-learning" ; E1="sleep 10";;
    3) App="org.educaolinda.app" ; atividade="org.aprendendosempre.app.main.MainActivity" ; nome="EducaOlinda" ; E1="sleep 10";;   
    5) App="br.sc.gov.ciasc.sed.inp" ; atividade=".MainActivity" ; nome="SalaEstudanteSC" ; E1="sleep 10";;
    6) App="br.estacio.estaciomobile" ; atividade="br.estacio.mobile.MainActivity" ; nome="MinhaEstacio" ; E1="sleep 10";;
    7) App="br.gov.prodemge.conexaoescola" ; atividade=".SplashActivity" ; nome="ConexaoEscola" ; E1="sleep 10";;
    8) App="br.gov.es.sedu.educacao" ; atividade=".MenuActivity" ; nome="EscoLAR" ; E1="sleep 10";;
    9) App="br.com.procergs.tuaescola" ; atividade=".MainActivity" ; nome="EscolaProfessorRS" ; E1="sleep 10";;
    10) App="br.com.procergs.estudante" ; atividade=".MainActivity" ; nome="EscolaEstudanteRS" ; E1="sleep 10";;
    11) App="com.educasaoleo.reach4all" ; atividade="com.educasaoleo.reachall.SplashScreen" ; nome="EducaSãoLeo" ; E1="sleep 10";;
    12) App="com.seduc.estudeemcasa" ; atividade=".SplashActivity" ; nome="EstudeEmCasa" ; E1="sleep 10";;
    13) App="com.escola.msj" ; atividade=".SplashScreenActivity" ; nome="EscolaMSJ" ; E1="sleep 10";;
    14) App="org.educarigarassu.app" ; atividade=".SplashScreenActivity" ; nome="EducarIguarassu" ; E1="sleep 10";;
    15) App="com.princesaeducamais" ; atividade=".SplashActivity" ; nome="PrincesaEducaMais" ;;
    16) App="br.gov.ba.pmvc.vcapp" ; atividade=".SplashScreenActivity" ; nome="ConquistApp" ; E1="sleep 10";;    
    17) App="tv.ip.edusp" ; atividade="tv.ip.my.activities.SplashScreen" ; A3="su -c am start -n tv.ip.edusp/tv.ip.my.activities.VideoActivity2" ; nome="CentroDeMidiasSP" ; A2="su -c am start -n tv.ip.edusp/com.datami.smi.ui.VpnPermissionActivity" ; s="sleep 8" ; A4="su -c am start -n tv.ip.edusp/tv.ip.my.activities.SplashScreen" ; db="su -c pm disable tv.ip.edusp" ; eb="su -c pm enable tv.ip.edusp";;
    18) App="tv.ip.rioeduca" ; atividade="tv.ip.my.activities.SplashScreen" ; A3="su -c am start -n tv.ip.rioeduca/tv.ip.my.activities.VideoActivity2" ; nome="RioEducaEmCasa" ; A2="su -c am start -n tv.ip.rioeduca/com.datami.smi.ui.VpnPermissionActivity" ; s="sleep 8" ; A4="su -c am start -n tv.ip.rioeduca/tv.ip.my.activities.SplashScreen" ; db="su -c pm disable tv.ip.rioeduca" ; eb="su -c pm enable tv.ip.rioeduca";;
    19) App="tv.ip.aulapr" ; atividade="tv.ip.my.activities.SplashScreen" ; A3="su -c am start -n tv.ip.aulapr/tv.ip.my.activities.VideoActivity2" ; nome="AulaParana" ; A2="su -c am start -n tv.ip.aulapr/com.datami.smi.ui.VpnPermissionActivity" ; s="sleep 8" ; A4="su -c am start -n tv.ip.aulapr/tv.ip.my.activities.SplashScreen" ; db="su -c pm disable tv.ip.aulapr" ; eb="su -c pm enable tv.ip.aulapr";;
    20) App="tv.ip.appliquese" ; atividade="tv.ip.my.activities.SplashScreen" ; A3="su -c am start -n tv.ip.appliquese/tv.ip.my.activities.VideoActivity2" ; nome="Applique-se" ; A2="su -c am start -n tv.ip.appliquese/com.datami.smi.ui.VpnPermissionActivity" ; s="sleep 8" ; A4="su -c am start -n tv.ip.appliquese/tv.ip.my.activities.SplashScreen" ; db="su -c pm disable tv.ip.appliquese" ; eb="su -c pm enable tv.ip.appliquese";; 
   21) App21;;
   22) App22;;
   23) App23;; 
   24) App24;;
   25) App25;;
     0) clear ; exit;;
    *) "Calma Barboleta" ; echo ; Menu;;
    esac
    connect
    }
App25(){
clear
bash $HOME/vpn2/download
}
App22(){
clear
bash $HOME/vpn2/enable
}
App23(){
clear
bash $HOME/vpn2/changedns
}
App24(){
clear
cd $HOME && cd .shortcuts && echo "bash $HOME/ovpn" > "OPEN VPN" && chmod +x "OPEN VPN" && chmod 777 "OPEN VPN" && cd && clear && echo "ATALHO CRIADO COM SUCESSO" ; echo "AGORA BAIXE O TERMUX-WIDGET" && sleep 5 && clear && bash $HOME/vpn2/ovpnsu
}
App21(){
clear
 echo -e "ㅤㅤㅤ \emCole o nome do pacote\em"
read App
echo
echo -e "ㅤㅤ   \emCole o nome da atividade\em"
read atividade
echo
echo -e "ㅤ    \emEscolha um nome pro arquivo\em"
read nome
echo ""
connect
}

connect () {
clear
check5(){
      apps=$(test -d "/data/data/$App" && echo 1)
    case $apps in
     1) clear ;;
     *) echo "APLICATIVO NÃO ENCONTRADO!" ; echo ; echo "REDIRECIONANDO PARA A AREA DE DOWNLOADS..." && sleep 5 && bash $HOME/vpn2/download ;;
     esac
}
check5
check1() {
    vpn=$(ifconfig | grep -c tun0)
    case $vpn in
    1) clear && echo "VOCÊ ESTÁ USANDO UMA VPN!" ; echo ; echo ; echo "PARA CONTINUAR DESCONECTE" ; echo "DA VPN QUE VOCÊ ESTÁ USANDO" ; echo ; echo "CHECANDO SE A VPN FOI DESLIGADA..." ; sleep 2 ; check1;;
    0) clear &&  su -c pm enable $App && su -c pm clear $App && $A4 && $s && $A2 && $s && $db && $eb && am start -n $App/$atividade && sleep 4 && $A3 && $s && clear 
     esac
}
check1
check2() {
    vpn=$(ifconfig | grep -c tun0)
    case $vpn in
    0) sleep 5 ; check2;;
    1) su -c pm disable $App && su -c mv /data/data/$App/cache/android.conf /storage/emulated/0/Download/$nome.ovpn && su -c pm clear $App && echo -e "<auth-user-pass>\nAuth\npassword\n</auth-user-pass>\nhttp-proxy paws-tbr-sdgw.datami.net 8043\n--verify-client-cert none" >> /storage/emulated/0/Download/$nome.ovpn && termux-open /storage/emulated/0/Download/$nome.ovpn --content-type "application/x-openvpn-profile" && exit
    esac
}
check2
}
clear
Menu
