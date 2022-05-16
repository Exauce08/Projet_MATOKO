
<?php
/*
//VARIABLES
$nom='Exau';//declaration et initialisation d'une variable
$prenom='MATOKO';
$note=10;
$note2=15;
$age=22;
$genre='feminin';
//affichage de valeur des variables avec ""(texte et variable) .(variable)  ''(texte)
echo"\nBonjour $nom $prenom Vous avez eu".' '.(($note+$note2)/2).' '.'de moyenne';
//ou
$moyenne=($note+$note2)/2;
echo"\n Bonjour $nom $prenom vous avez eu $moyenne de moyenne";
echo"\nVous etes du genre $genre et vous avez $age ans";
//TABLEAU
$notes=[10,20,2,8,209,'lysis'];
$eleve=['Paul','Dan',[10,9,15]];
//declaration de tableau
echo "\n$notes[1]";
echo"\n$notes[5]";
echo "\n$eleve[0]\n";
//affichage tableau
$personne=[
    'nom'=>'mat',
    'prenom'=>'elian',
    'notes'=>[12,9,8,20]
];

//les index de valeurs d'un tableau

echo $personne['prenom'].' '.$personne['nom'];
// affichage des valeurs du tableau grace aux index les uns a la suite des autres
 $personne['prenom']='Marcel';
$personne['notes'][1]=18;
//remplace la valeur d'un tableau et l'affiche
print_r ($personne['notes']);
//affichage graphique des valeurs du tableau
$personne['notes'][]=0;
$personne[]='CM2-A';
//ajoute une valeur au tableau

// CONDITIONS

$note=12;
if($note>=10)
    {
        echo 'Bravo vous avez la moyenne';

    }
else{

    echo'Dommage vous n\'avez pas la moyenne';

    }
//IF ELSEIFE E

$votre_note=(int)readline('entrez votre note:');
if($votre_note>10)
    {
         echo 'Bravo vous avez la moyenne';
    }
elseif($votre_note===10)
        {
            echo 'Vous avez juste la moyenne';
        }
else{

    echo'Dommage vous n\'avez pas la moyenne';

    }
    
    //READLINE(scanf)
    //Autre exmple
    $action=(int)readline('Choissisez une action: (1:attaquer, 2:defendre, 3:passer mon tour)');
    if($action===1)
        {
            echo'J\'attaque!';
        }
    elseif($action===2)
        {
            echo'Je defends';
        }
    elseif($action===3)
        {
            echo'Je passes mon tour';
        }
    else
        {
            echo'Commande inconnue';
        }

        
        //Autre ecriture avec switch
        $action=(int)readline('Choissisez une action: (1:attaquer, 2:defendre, 3:passer mon tour)');
        switch($action)
            {
                case 1:
                    echo'J\'attaque!';
                    break;
                case 2:
                    echo'Je defends';
                    break;
                case 3:
                    echo'Je passes mon tour';
                    break;
                default:
                echo'Commande inconnue';
            }

//OPERATEURS LIENS LOGIQUES
$heure=(int)readline('Entrez une heure: ');
if((9<=$heure && $heure<=12)||(14<=$heure)&&($heure<=17))
    {
        echo'Le magasion sera ouvert';
    }
else
    {
        echo'Le magasin sera fermé';
    }

//BOUCLES WHILE FOR FOREACH
$nbre=null;

while ($nbre!==10) 
    {
        $nbre=(int)readline('Entrez un nombre: ');
    }
echo'Bravo vous etes un génie!!!';

//for
for($i=0;$i<10;$i++)
    {
        echo"* $i\n";
    }


//foreach
$notes=[10,15,16];
foreach($notes as $note)
    {
        echo"-$note \n";
    }
$eleves=[
    
    'CM2'=>['Jean','lys','Marie','glo'],//classe CM2 jean lys....
    'CM1'=>['Marc','guillaume','frederic']//Class CM1 marc guillaume...
    
];
    foreach($eleves as $classe=>$eleve)//affiche les eleves et leurs classes
    {
        echo"$eleve est dans la classe $classe\n";
    }
    
    foreach($eleves as $classe=>$list_eleve)//affiche les eleves par classe
    {
        echo "La classe $classe:\n";//affiche les classe
        foreach($list_eleve as $eleve)
        {
            echo"-$eleve\n";//affiche en regroupant les eleves de la meme classe 
        }
        echo"\n";
    }
    //TP ajout de notes
    $notes=[];
   $answer=null;
    while($answer!=='fin')//tant qu'il ne tape pas fin
    {
        $answer=readline('Entrez votre note ou tapez fin:'."\n");
        if($answer!=='fin')//on ajoute la note tapé au tableau
        {
            $notes[]=(int)$answer;
        }
    }
            foreach($notes as $note)//pour chaque note tapé
            {
                echo"-$note\n";
            }
        
   */ 
  //ajout horaire magasin
  $debut=(int)readline('Entrez l\'heure d\'ouverture du magasin:');
  $fin=(int)readline("\n".'Entrez l\' heure de fermeture du magasin:');
  $rajout=null;
  $crenaux=[];
  while($rajout!==0)
        {
            $rajout=readline("\n".'Voulez vous rajouter un nouveau créneaux?:  (1 pour OUI et 0 pour NON');

            if($rajout!==0)
                    {
                            $crenaux[]=(int)$rajout;

                    }
        }

        foreach($crenaux as $crenau)
            {
                echo"Voici le nouveau crenau : $crenau\n";
            }
  
  $horaire=(int)readline("\n".'Veuillez entrer une heure:');
        if(($debut<=$horaire)&&($horaire<=$fin))
        {
            
             echo'Le magasion sera ouvert';
          
        }     
        else
            {
                echo'Le magasin sera fermé';
            }
        


?>

