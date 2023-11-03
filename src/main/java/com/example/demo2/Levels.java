package com.example.demo2;

public class Levels {
    public final static LevelQuest MAIN_LEVEL;
    static {
        MAIN_LEVEL = new LevelQuest("Вы работаете в овощной лавке и в один прекрасный день к вашей лавке приходит жуткая старуха. Она просит 5 кочанов капусты, а после просит Вас помочь ей донести эти кочаны до дома. Согласитесь ли Вы?","Да","Нет");
        //L1
        LevelQuest l1 = new LevelQuest("Вы согласились помочь старухе. Путь к ее дому оказался не близким, когда Вы дошли до ее дома, то увидели крохотный старинный домик. Старуха благодарит Вас за помощь и приглашает зайти внутрь. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2 = new LevelQuest("Ваша помощница подталкивает Вас помочь старухе, говоря о том, какая тяжелая у нее сумка. Старуха обещает отблагодарить Вас за помощь. Согласитесь ли Вы помочь?","Да","Нет");
        //L2
        LevelQuest l1_1 = new LevelQuest("Внутри дом оказывается огромным замком, наверняка Вы удивлены. Старуха смеется и называет это магической иллюзией. Она напоминает, что хотела Вас отблагодарить, и говорит, что готова выполнить любое Ваше желание, взамен на одну услугу. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l1_2 = new LevelQuest("Старуха напоминает, что должна отблагодарить Вас за помощь, поэтому настаивает на том, чтобы Вы зашли внутрь. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_1 = new LevelQuest("Вы согласились помочь старухе. Путь к ее дому оказался не близким, когда Вы дошли до ее дома, то увидели крохотный старинный домик. Старуха благодарит Вас за помощь и приглашает зайти внутрь, согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_2 = new LevelQuest("Старуха разозлилась на Вас и начала нашептывать проклятие, а после скрылась в толпе. С каждым днем Вы стали чувствовать себя хуже. Станете ли Вы искать старуху, чтобы снять проклятие?","Да","Нет");
        //L3
        LevelQuest l1_1_1 = new LevelQuest("Вы согласились разбудить девушку. После ее пробуждения старуха предлагает выполнить любое Ваше желание.","Попросить богатство","Попросить Отпустить");
        LevelQuest l1_1_2_End = new LevelQuest("Вы отказались будить девушку. Старуха разозлилась и начала Вас проклинать. Вы пытались убежать, но проклятие Вас нагнало, и Вы превратились в старый, потрепанный диван, который стоит в углу комнаты старухи. Теперь каждый, кто садится на вас, чувствует ваше отчаяние и грусть.",null,null);
        LevelQuest l1_2_1 = new LevelQuest("Внутри дом оказывается огромным замком, наверняка Вы удивлены. Старуха смеется и называет это магической иллюзией. Она напоминает, что хотела Вас отблагодарить, и говорит, что готова выполнить любое Ваше желание, взамен на одну услугу. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l1_2_2 = new LevelQuest("Старуха силой заталкивает Вас в дом. Внутри дом оказался огромным замком, наверняка Вы удивлены. Старуха смеется и называет это магической иллюзией. Она напоминает, что хотела Вас отблагодарить, и говорит, что готова выполнить любое Ваше желание, взамен на одну услугу. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_1_1 = new LevelQuest("Внутри дом оказывается огромным замком, наверняка Вы удивлены. Старуха смеется и называет это магической иллюзией. Она напоминает, что хотела Вас отблагодарить, и говорит, что готова выполнить любое Ваше желание, взамен на одну услугу. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_1_2 = new LevelQuest("Старуха силой заталкивает Вас в дом. Внутри дом оказался огромным замком, наверняка Вы удивлены. Старуха смеется и называет это магической иллюзией. Она напоминает, что хотела Вас отблагодарить, и говорит, что готова выполнить любое Ваше желание, взамен на одну услугу. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_2_1 = new LevelQuest("Спустя два дня Вы нашли старуху. Вы просите снять проклятие и готовы сделать для этого все. Она приводит Вас в комнату, где лежит окаменелая девушка. Старуха просит Вас докоснуться до нее, чтобы она смогла проснуться. Согласитесь ли Вы?","Да","Нет");
        LevelQuest l2_2_2_End = new LevelQuest("Вы не стали бороться с проклятием, поэтому спустя две недели Вы отправились в мир иной.",null,null);
        //L4
        LevelQuest l1_1_1_1_End = new LevelQuest("Старуха согласилась. Она превратила Вас в золотую статую Теперь Вы навсегда останетесь украшением в доме старухи.",null,null);
        LevelQuest l1_1_1_2_End = new LevelQuest("Старуха рассмеялась и похвалила Вашу смекалку. Теперь Вы свободны.",null,null);
        LevelQuest l1_2_1_1 = new LevelQuest("Вы согласились разбудить девушку. После ее пробуждения старуха предлагает выполнить любое Ваше желание.","Попросить вечную молодость","Попросить отпустить");
        LevelQuest l1_2_1_2_End = new LevelQuest("Вы отказались будить девушку. Старуха разозлилась и начала Вас проклинать. Вы пытались убежать, но проклятие Вас нагнало, и Вы превратились в глухой занавес, закрывающий окно в комнате старухи. Вы становитесь свидетелем всего, что происходит внутри, но мир за окном остается скрытым.",null,null);
        LevelQuest l1_2_2_1 = new LevelQuest("Вы согласились разбудить девушку. После ее пробуждения старуха предлагает выполнить любое Ваше желание.","Попросить неограниченное знание","Попросить отпустить");
        LevelQuest l1_2_2_2_End = new LevelQuest("Вы отказались будить девушку. Старуха разозлилась и начала Вас проклинать. Вы пытались убежать, но проклятие Вас нагнало, и Вы превратились в пыльный ковер, лежащий у двери. Каждый, кто входит в дом, ступает на вас, оставляя следы своего прошлого.",null,null);
        LevelQuest l2_1_1_1 = new LevelQuest("Вы согласились разбудить девушку. После ее пробуждения старуха предлагает выполнить любое Ваше желание.","Попросить непобедимость","Попросить отпустить");
        LevelQuest l2_1_1_2_End = new LevelQuest("Вы отказались будить девушку. Старуха разозлилась и начала Вас проклинать. Вы пытались убежать, но проклятие Вас нагнало, и Вы превратились в ржавый светильник, который теперь освещает комнату старухи. Ваш свет мерцает и создает зловещую атмосферу в помещении.",null,null);
        LevelQuest l2_1_2_1 = new LevelQuest("Вы согласились разбудить девушку. После ее пробуждения старуха предлагает выполнить любое Ваше желание.","Попросить невидимость","Попросить отпустить");
        LevelQuest l2_1_2_2_End = new LevelQuest("Вы отказались будить девушку. Старуха разозлилась и начала Вас проклинать. Вы пытались убежать, но проклятие Вас нагнало, и Вы превратились в старый письменный стол, на котором старуха пишет свои заклинания. Каждую ночь вы слышите шепот её слов, произносимых над вами.",null,null);
        LevelQuest l2_2_1_1_End = new LevelQuest("Вы согласились разбудить девушку. Старуха снимает с Вас проклятие, но не разрешает Вам уйти. Теперь Вы будете узником дома старухи.",null,null);
        LevelQuest l2_2_1_2_End = new LevelQuest("Старуха усмехается хитро: \"Ты принял решение, и теперь пожалуй, это будет последним твоим решением.\" Вы начинаете чувствовать, как ваши ноги превращаются в камень. Это проклятие продолжает распространяться, и вскоре вы полностью окаменеваете, став статуей в комнате старухи на вечность.",null,null);
        //L5
        LevelQuest l1_2_1_1_1_End = new LevelQuest("Старуха согласилась. Она провела рукой перед вашим лицом, и вы почувствовали, как ваша кожа становится упругой, а волосы — темными и густыми. Однако, став моложе, вы теперь обязаны служить старухе , превратившись в её вечного слугу.",null,null);
        LevelQuest l1_2_1_1_2_End = new LevelQuest("Старуха рассмеялась и похвалила Вашу смекалку. Теперь Вы свободны.",null,null);
        LevelQuest l1_2_2_1_1_End = new LevelQuest("Старуха задумчиво кивнула и прикоснулась к вашему лбу. Вдруг ваш разум наполнился знаниями со всех уголков мира. Однако, с таким огромным объемом информации пришла и невыносимая головная боль. Вы не могли сосредоточиться ни на чем и были обречены провести оставшуюся жизнь в изоляции, пытаясь справиться с потоком знаний.",null,null);
        LevelQuest l1_2_2_1_2_End = new LevelQuest("Старуха рассмеялась и похвалила Вашу смекалку. Теперь Вы свободны.",null,null);
        LevelQuest l2_1_1_1_1_End = new LevelQuest("Старуха ухмыльнулась и выполнила ваше желание. Теперь вы действительно непобедимы. Однако теперь в так же стали стражем у входа в её дом, защищая его от посторонних на протяжении вечности.",null,null);
        LevelQuest l2_1_1_1_2_End = new LevelQuest("Старуха рассмеялась и похвалила Вашу смекалку. Теперь Вы свободны.",null,null);
        LevelQuest l2_1_2_1_1_End = new LevelQuest("Старуха кивнула головой и проклятие сделало вас невидимым. Но теперь вы служите ей в качестве шпиона, беспрестанно следя за теми, кто пытается подойти к её дому или узнать её тайны.",null,null);
        LevelQuest l2_1_2_1_2_End = new LevelQuest("Старуха рассмеялась и похвалила Вашу смекалку. Теперь Вы свободны.",null,null);

        //binding TODO:Убрать нулы
        MAIN_LEVEL.addNextLevels(l1,l2);
        //L1
        l1.addNextLevels(l1_1,l1_2);
        l2.addNextLevels(l2_1,l2_2);
        //L2
        l1_1.addNextLevels(l1_1_1,l1_1_2_End);
        l1_2.addNextLevels(l1_2_1,l1_2_2);
        l2_1.addNextLevels(l2_1_1,l2_1_2);
        l2_2.addNextLevels(l2_2_1,l2_2_2_End);
        //L3
        l1_1_1.addNextLevels(l1_1_1_1_End,l1_1_1_2_End);
        l1_1_2_End.addNextLevels(null,null);
        l1_2_1.addNextLevels(l1_2_1_1,l1_2_1_2_End);
        l1_2_2.addNextLevels(l1_2_2_1,l1_2_2_2_End);
        l2_1_1.addNextLevels(l2_1_1_1,l2_1_1_2_End);
        l2_1_2.addNextLevels(l2_1_2_1,l2_1_2_2_End);
        l2_2_1.addNextLevels(l2_2_1_1_End,l2_2_1_2_End);
        l2_2_2_End.addNextLevels(null,null);
        //L4
        l1_1_1_1_End.addNextLevels(null,null);
        l1_1_1_2_End.addNextLevels(null,null);
        l1_2_1_1.addNextLevels(l1_2_1_1_1_End,l1_2_1_1_2_End);
        l1_2_1_2_End.addNextLevels(null,null);
        l1_2_2_1.addNextLevels(l1_2_2_1_1_End,l1_2_2_1_2_End);
        l1_2_2_2_End.addNextLevels(null,null);
        l2_1_1_1.addNextLevels(l2_1_1_1_1_End,l2_1_1_1_2_End);
        l2_1_1_2_End.addNextLevels(null,null);
        l2_1_2_1.addNextLevels(l2_1_2_1_1_End,l2_1_2_1_2_End);
        l2_1_2_2_End.addNextLevels(null,null);
        l2_2_1_1_End.addNextLevels(null,null);
        l2_2_1_2_End.addNextLevels(null,null);
        //L5
        l1_2_1_1_1_End.addNextLevels(null,null);
        l1_2_1_1_2_End.addNextLevels(null,null);
        l1_2_2_1_1_End.addNextLevels(null,null);
        l1_2_2_1_2_End.addNextLevels(null,null);
        l2_1_1_1_1_End.addNextLevels(null,null);
        l2_1_1_1_2_End.addNextLevels(null,null);
        l2_1_2_1_1_End.addNextLevels(null,null);
        l2_1_2_1_2_End.addNextLevels(null,null);

        //set isDefeat
        l1_1_2_End.setDefeat();
        l2_2_2_End.setDefeat();
        l1_1_1_1_End.setDefeat();
        l1_2_1_2_End.setDefeat();
        l1_2_2_2_End.setDefeat();
        l2_1_1_2_End.setDefeat();
        l2_1_2_2_End.setDefeat();
        l2_2_1_1_End.setDefeat();
        l2_2_1_2_End.setDefeat();
        l1_2_1_1_1_End.setDefeat();
        l1_2_2_1_1_End.setDefeat();
        l2_1_1_1_1_End.setDefeat();
        l2_1_2_1_1_End.setDefeat();

        //add Image "../images/.png"
        MAIN_LEVEL.addImageForLevel("../images/A.png");
        //L1
        l1.addImageForLevel("../images/AA.png");
        l2.addImageForLevel("../images/BA.png");
        //L2
        l1_1.addImageForLevel("../images/AB.png");
        l1_2.addImageForLevel("../images/AA.png");
        l2_1.addImageForLevel("../images/AA.png");
        l2_2.addImageForLevel("../images/AJ.png");
        //L3
        l1_1_1.addImageForLevel("../images/AY.png");
        l1_1_2_End.addImageForLevel("../images/AC.png");
        l1_2_1.addImageForLevel("../images/AB.png");
        l1_2_2.addImageForLevel("../images/AB.png");
        l2_1_1.addImageForLevel("../images/AB.png");
        l2_1_2.addImageForLevel("../images/AB.png");
        l2_2_1.addImageForLevel("../images/AB.png");
        l2_2_2_End.addImageForLevel("../images/AZ.png");
        //l4
        l1_1_1_1_End.addImageForLevel("../images/AN.png");
        l1_1_1_2_End.addImageForLevel("../images/AX.png");
        l1_2_1_1.addImageForLevel("../images/AY.png");
        l1_2_1_2_End.addImageForLevel("../images/AM.png");
        l1_2_2_1.addImageForLevel("../images/AY.png");
        l1_2_2_2_End.addImageForLevel("../images/AP.png");
        l2_1_1_1.addImageForLevel("../images/AY.png");
        l2_1_1_2_End.addImageForLevel("../images/AS.png");
        l2_1_2_1.addImageForLevel("../images/AY.png");
        l2_1_2_2_End.addImageForLevel("../images/AV.png");
        l2_2_1_1_End.addImageForLevel("../images/AY.png");
        l2_2_1_2_End.addImageForLevel("../images/AR.png");
        //l5
        l1_2_1_1_1_End.addImageForLevel("../images/AH.png");
        l1_2_1_1_2_End.addImageForLevel("../images/AX.png");
        l1_2_2_1_1_End.addImageForLevel("../images/AK.png");
        l1_2_2_1_2_End.addImageForLevel("../images/AX.png");
        l2_1_1_1_1_End.addImageForLevel("../images/AE.png");
        l2_1_1_1_2_End.addImageForLevel("../images/AX.png");
        l2_1_2_1_1_End.addImageForLevel("../images/AF.png");
        l2_1_2_1_2_End.addImageForLevel("../images/AX.png");
    }
}
