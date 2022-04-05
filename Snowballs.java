@EventHandler
        public void onSnowballHit(EntityDamageByEntityEvent e) {
            if ((e.getDamager() instanceof Snowball))
                if ((e.getEntity() instanceof Player)) {
                    double damage = 0.01;
                    e.setDamage(damage);
                    Projectile projectile = (Projectile) e.getEntity();

                    Player attacked = (Player) e.getEntity();
                    ProjectileSource ps = ((Snowball) e.getDamager()).getShooter();

                    if (!(ps instanceof Player)) {
                        return;
                    }

                    Player shooter = (Player) ps;
                    ArrayList<java.lang.String> lore = new ArrayList<>();
                    lore.add("This balls can freeze a player");

                        if (projectile instanceof Snowball) {
                            if (shooter.getInventory().getItemInMainHand().getItemMeta().getLore().equals(lore)) {
                                attacked.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 20, true));
                                attacked.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 100, true));

                            }
                        }

                }
        }
